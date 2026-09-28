package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public final XmlPullParser a;
    public int b = 0;
    public final txz c;

    public zc0(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        txz txzVar = new txz();
        txzVar.a = new float[64];
        this.c = txzVar;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (g9h0.e(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        return Intrinsics.g(this.a, zc0Var.a) && this.b == zc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return rr1.b(sb, this.b, ')');
    }
}
