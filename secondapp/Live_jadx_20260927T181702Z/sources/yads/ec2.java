package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ec2 extends ql2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wq f148648d = new wq() { // from class: yads.yz3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return ec2.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f148649c;

    public ec2() {
        this.f148649c = -1.0f;
    }

    public static ec2 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f10 == -1.0f ? new ec2() : new ec2(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ec2) && this.f148649c == ((ec2) obj).f148649c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f148649c)});
    }

    public ec2(float f10) {
        ni.a("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f148649c = f10;
    }
}
