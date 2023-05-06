#
# ~/.bashrc
#

# If not running interactively, don't do anything
[[ $- != *i* ]] && return

alias ls='ls --color=auto'
alias grep='grep --color=auto'

# Define colors
cyan="\[\033[36m\]"
purple="\[\033[35m\]"
white="\[\033[37m\]"

# Define prompt format
export PS1="$cyan\u $purple\w $white"

#Reset color at the end of each command

export PROMPT_COMMAND='echo -ne "\033[0m"'
export BROWSER='/usr/bin/firefox'
