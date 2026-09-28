package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k26 {
    public final ArrayList a;
    public final g7n b;

    public k26(ArrayList arrayList, g7n g7nVar) {
        this.a = arrayList;
        this.b = g7nVar;
        km20.a("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        km20.g("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) CollectionsKt.T(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k26)) {
            return false;
        }
        k26 k26Var = (k26) obj;
        return this.a.equals(k26Var.a) && Intrinsics.g(this.b, k26Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g7n g7nVar = this.b;
        return iHashCode + (g7nVar != null ? g7nVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(CollectionsKt.a0(this.a, ",", null, null, null, 62));
        g7n g7nVar = this.b;
        if (g7nVar != null) {
            str = ", compatId=" + g7nVar;
        } else {
            str = "";
        }
        return j26.a(sb, str, '}');
    }
}
