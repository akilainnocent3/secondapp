package com.unity3d.services;

import com.unity3d.services.core.log.DeviceLog;
import jv.o0;
import kotlin.jvm.internal.s1;
import or.a;
import or.j;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SDKErrorHandler.kt\ncom/unity3d/services/SDKErrorHandler\n*L\n1#1,110:1\n35#2,2:111\n*E\n"})
public final class SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1 extends a implements o0 {
    public SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(o0.b bVar) {
        super(bVar);
    }

    @Override // jv.o0
    public void handleException(@l j jVar, @l Throwable th2) {
        DeviceLog.error("SDKErrorHandler encountered an exception: %s", th2);
    }
}
