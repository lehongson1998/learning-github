echo $(date) >> file2.txt
git add file2.txt shell.sh
x=$(date)
git commit -m "update new file2 and shell.sh of $(x)"
git push
git log --oneline