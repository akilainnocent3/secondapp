package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j94 {
    public static final /* synthetic */ int a = 0;

    public static boolean a(long j, qaw qawVar, Map map) {
        if (!Intrinsics.g(map.get(Long.valueOf(j)), Boolean.TRUE) || qawVar.d != j || qawVar.c <= 0) {
            return false;
        }
        Double d = qawVar.e;
        return (d != null ? d.doubleValue() : 0.0d) > 0.0d;
    }

    public static boolean b(long j, qaw qawVar, Map map) {
        map.getClass();
        if (!qawVar.a || qawVar.b != j || qawVar.c <= 0) {
            return false;
        }
        Double d = qawVar.e;
        return (d != null ? d.doubleValue() : 0.0d) > 0.0d && !Intrinsics.g(map.get(Long.valueOf(j)), Boolean.TRUE);
    }
}
