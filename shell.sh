echo $(date) >> git_log_time.log
git add git_log_time.log shell.sh
x=$(date)
git commit -m "update git_log_time and shell.sh of $x"
git push
git log --oneline