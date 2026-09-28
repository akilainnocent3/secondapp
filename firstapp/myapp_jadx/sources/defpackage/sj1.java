package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends v7z {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public sj1(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            bmy.a("Null getUuid");
            throw null;
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        this.d = rect;
        if (size == null) {
            bmy.a("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    @Override // defpackage.v7z
    public final Rect a() {
        return this.d;
    }

    @Override // defpackage.v7z
    public final int b() {
        return this.c;
    }

    @Override // defpackage.v7z
    public final int c() {
        return this.f;
    }

    @Override // defpackage.v7z
    public final Size d() {
        return this.e;
    }

    @Override // defpackage.v7z
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v7z)) {
            return false;
        }
        v7z v7zVar = (v7z) obj;
        return this.a.equals(v7zVar.f()) && this.b == v7zVar.e() && this.c == v7zVar.b() && this.d.equals(v7zVar.a()) && this.e.equals(v7zVar.d()) && this.f == v7zVar.c() && this.g == v7zVar.g() && !v7zVar.h();
    }

    @Override // defpackage.v7z
    public final UUID f() {
        return this.a;
    }

    @Override // defpackage.v7z
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.v7z
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (((this.g ? 1231 : 1237) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return mq0.a(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}
