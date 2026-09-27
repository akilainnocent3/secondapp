package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class D4 implements A7 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58551a;

        static {
            int[] iArr = new int[EnumC4621z4.values().length];
            try {
                iArr[EnumC4621z4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4621z4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4621z4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4621z4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f58551a = iArr;
        }
    }

    @Override // com.ironsource.A7
    @oy.m
    public F4 a(@oy.l Context context, @oy.l EnumC4621z4 source) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(source, "source");
        int i10 = a.f58551a[source.ordinal()];
        if (i10 == 1) {
            return new C4(context, "supersonic_shared_preferen");
        }
        if (i10 == 2) {
            return new C4(context, "unityads-installinfo");
        }
        if (i10 == 3) {
            return new C4(context, E4.f58877c);
        }
        if (i10 == 4) {
            return null;
        }
        throw new dr.o0();
    }
}
