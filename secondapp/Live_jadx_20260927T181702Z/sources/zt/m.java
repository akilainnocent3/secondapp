package zt;

import cv.k0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum m {
    PLAIN { // from class: zt.m.b
        @Override // zt.m
        @oy.l
        public String e(@oy.l String string) {
            m0.p(string, "string");
            return string;
        }
    },
    HTML { // from class: zt.m.a
        @Override // zt.m
        @oy.l
        public String e(@oy.l String string) {
            m0.p(string, "string");
            return k0.z2(k0.z2(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* synthetic */ m(x xVar) {
        this();
    }

    @oy.l
    public abstract String e(@oy.l String str);
}
