#ifndef STATIC_LINK
#define IMPLEMENT_API
#endif

#if defined(HX_WINDOWS) || defined(HX_MACOS) || defined(HX_LINUX)
#define NEKO_COMPATIBLE
#endif


#include <hx/CFFI.h>
#include "ruecountly.h"


using namespace ruecountly;

#ifdef IPHONE

value ly_Init(value serverId, value appKey)
{
    lyInit(val_string(serverId), val_string(appKey));
    return alloc_null();
}
DEFINE_PRIM(ly_Init, 2);


#endif

extern "C" void ruecountly_main () {
	
	val_int(0); // Fix Neko init
	
}
DEFINE_ENTRY_POINT (ruecountly_main);



extern "C" int ruecountly_register_prims () { return 0; }