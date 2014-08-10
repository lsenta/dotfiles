#!/bin/sh
# trashit

# original script
#    http://www.macosxhints.com/article.php?story=20030217172653485
#    author: Shane Celis <shane (at) gnufoo (dot) org>
#
# Sun, 20-May-2007; 06:47:22 
#    minor changes...

function trashit() {
  if [ $# -eq 0 ]; then
    echo "usage: trashit <files...>" >&2
    exit 2;
  fi
  
  for file in "$@"; do
    # get just file name 
    destfile="`basename \"$file\"`"
    suffix='';
    i=0;
  
    # If that file already exists, change the name
    while [ -e "$HOME/trash/${destfile}${suffix}" ]; do
      suffix=" - copy $i";
      i=`expr $i + 1`
    done
  
    mv -i "$file" "$HOME/trash/${destfile}${suffix}"
  done
}