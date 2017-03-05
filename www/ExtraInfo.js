//require用于引入类，exports用于导出我们的方法。这里对外公开了getExtra方法，以便在app中找到
var exec = require('cordova/exec');
exports.getExtra = function(success,error){
	exec(success,error,"ExtraInfo","getExtra",[]);
}