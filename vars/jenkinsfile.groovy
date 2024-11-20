def call(name)
{
  sh "date"
  sh "ifconfig -a"
  echo "${name}"
} 
