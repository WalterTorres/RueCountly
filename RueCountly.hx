package;

#if cpp
import cpp.Lib;
#elseif neko
import neko.Lib;
#end


class RueCountly
{
	#if ios
	private static var ruecountly_init = Lib.load ("ruecountly", "lyInit",2);
	public static function InitCountly(ServerID:String, AppKey:String):Void
	{
		ruecountly_init(ServerID, AppKey);
	}
	#end

}