package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import dr.i1;
import kotlin.jvm.internal.m0;
import l3.a;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable thE = i1.e(obj);
        m0.y(3, a.S4);
        if (thE instanceof Exception) {
            return (E) thE;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable thE = i1.e(obj);
        m0.y(3, a.S4);
        if (thE instanceof Exception) {
            return (E) thE;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    @m
    public static final InitializationException getInitializationExceptionOrNull(@l Object obj) {
        Throwable thE = i1.e(obj);
        if (thE instanceof InitializationException) {
            return (InitializationException) thE;
        }
        return null;
    }

    @l
    public static final InitializationException getInitializationExceptionOrThrow(@l Object obj) {
        Throwable thE = i1.e(obj);
        if (thE instanceof InitializationException) {
            return (InitializationException) thE;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
