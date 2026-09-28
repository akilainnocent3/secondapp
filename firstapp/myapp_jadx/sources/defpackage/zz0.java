package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface zz0 {
    public static final a a = new a();

    public static final class a implements zz0 {
        @Override // defpackage.zz0
        public final boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof nan) || !(obj2 instanceof nan)) {
                return Intrinsics.g(obj, obj2);
            }
            nan nanVar = (nan) obj;
            nan nanVar2 = (nan) obj2;
            return Intrinsics.g(nanVar.a, nanVar2.a) && Intrinsics.g(nanVar.b, nanVar2.b) && nanVar.e.equals(nanVar2.e) && Intrinsics.g(nanVar.q, nanVar2.q) && nanVar.r == nanVar2.r && nanVar.s == nanVar2.s;
        }

        @Override // defpackage.zz0
        public final int hashCode(Object obj) {
            if (!(obj instanceof nan)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            nan nanVar = (nan) obj;
            return nanVar.s.hashCode() + ((nanVar.r.hashCode() + ((nanVar.q.hashCode() + ((nanVar.e.hashCode() + ((nanVar.b.hashCode() + (nanVar.a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
        }

        public final String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
