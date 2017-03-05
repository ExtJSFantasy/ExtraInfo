public class ExtraInfo extends CordovaPlugin{
	/**
	 * [execute 继承CordovaPlugin类，重写execute方法]
	 * @param  action          [判断javascript中调用的方法，成功调用callbackContext.success(message),失败调用callbackContext.error(message) ]
	 * @param  args            [description]
	 * @param  callbackContext [回掉函数]
	 * @return                 [description]
	 * @throws JSONException   [异常抛出]
	 */
	public boolean execute(String action, JSONArray args,CallbackContext callbackContext) throws JSONException {
		Activity activity = this.cordova.getActivity();
		if(action.equals("getExtra")){
			Intent i = activity.getIntent();
			if(i.hasExtra(Intent.EXTRA_TEXT)){
				callbackContext.success(i.getStingExtra(Intent.EXTRA_TEXT));
			}else{
				callbackContext.error("");
			}
			return true;
		}
		return false;
	}
}