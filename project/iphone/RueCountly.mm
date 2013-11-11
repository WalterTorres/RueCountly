#include "ruecountly.h"



#import "Countly.h"
#import "Countly_OpenUDID.h"
#import <UIKit/UIKit.h>
#import <CoreTelephony/CTTelephonyNetworkInfo.h>
#import <CoreTelephony/CTCarrier.h>
#import "CountlyDB.h"

#include <sys/types.h>
#include <sys/sysctl.h>




namespace ruecountly
{

	void lyInit(const char *serverID, const char *appKey)
	{
		NSString *serverid = [[NSString alloc] initWithUTF8String:serverID];
		NSString *appkey = [[NSString alloc] initWithUTF8String:appKey];
		[[Countly sharedInstance] start:appkey withHost:serverid];
	}
	
}