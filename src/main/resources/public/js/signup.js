function IsDigit(cCheck)
{
return (('0'<=cCheck) && (cCheck<='9'));
}

function IsAlpha(cCheck)
{
return ((('a'<=cCheck) && (cCheck<='z')) || (('A'<=cCheck) && (cCheck<='Z')));
}

function IsValid()
{
var struserName = reg.UserName.value;
for (nIndex=0; nIndex<struserName.length; nIndex++)
{
cCheck = struserName.charAt(nIndex);
if (!(IsDigit(cCheck) || IsAlpha(cCheck)))
{
return false;
}
}
return true;
}
function chkEmail(str)
{
return str.search(/[\w\-]{1,}@[\w\-]{1,}\.[\w\-]{1,}/)===0?true:false;
}

function docheck()
{
if(reg.UserName.value==="")
{
alert("Please enter valid username");
return false;
}
else if(!IsValid())
{
alert("Username can only contain numbers and letters ");
return false;
}
else if(reg.UserPassword.value==="")
{
alert("please enter password");
return false;
}
else if(reg.UserPassword.value != reg.CUserPassword.value)
{
alert("the reentered password is not correct");
return false;
}
else if(reg.NickName.value ==="")
{
alert("Please enter nickname");
return false;
}
else if(reg.Email.value ==="")
{
alert("Please enter email address");
return false;
}
else if(!chkEmail(reg.Email.value))
{
alert("Please enter valid email address");
return false;
}
else
{
return true;
}
}
