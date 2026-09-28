package defpackage;

import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface xri0 {

    public static final class b implements xri0 {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("Loading(progress="), this.a, ')');
        }
    }

    public static final class a implements xri0 {
        public final mvi0 a;
        public final zqi0 b;
        public final kui0 c;
        public final nri0 d;
        public final boolean e;
        public final uui0 f;
        public final WDUserInfoModel g;

        public a(mvi0 mvi0Var, zqi0 zqi0Var, kui0 kui0Var, nri0 nri0Var, boolean z, uui0 uui0Var, WDUserInfoModel wDUserInfoModel) {
            mvi0Var.getClass();
            zqi0Var.getClass();
            kui0Var.getClass();
            nri0Var.getClass();
            uui0Var.getClass();
            wDUserInfoModel.getClass();
            this.a = mvi0Var;
            this.b = zqi0Var;
            this.c = kui0Var;
            this.d = nri0Var;
            this.e = z;
            this.f = uui0Var;
            this.g = wDUserInfoModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + mtg0.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31);
        }

        public final String toString() {
            return "Loaded(wheelPanelState=" + this.a + ", controlPanelData=" + this.b + ", sidePanelState=" + this.c + ", giftDialog=" + this.d + ", backgroundMusic=" + this.e + ", userAmount=" + this.f + ", userInfo=" + this.g + ')';
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(new mvi0(0), new zqi0(0), kui0.c.a, nri0.a.a, true, new uui0(0), new WDUserInfoModel(null, null, 3, null));
        }
    }
}
