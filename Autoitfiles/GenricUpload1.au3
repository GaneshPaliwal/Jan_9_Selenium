;wait for 10 sec for genric upload
Local $winID=WinWait("[CLASS:#32770]","",10)

;set focus on file name
ControlFocus($winId," ","Edit1")

;wit for 2sec
Sleep(2000)

;Set file path
ControlSetText($winId,"","Edit1","D:\Accelration\New\jan_9_Selenium\Autoitfiles\testfile.txt")

ControlClick($winId,"","Button1")