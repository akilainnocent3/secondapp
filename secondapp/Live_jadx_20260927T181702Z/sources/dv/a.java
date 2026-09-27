package dv;

import cs.j;
import cv.o;
import cv.p;
import cv.q;
import dr.l1;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j(name = "RegexExtensionsJDK8Kt")
public final class a {
    @l1(version = "1.2")
    @m
    public static final o a(@l p pVar, @l String name) {
        m0.p(pVar, "<this>");
        m0.p(name, "name");
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar != null) {
            return qVar.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
