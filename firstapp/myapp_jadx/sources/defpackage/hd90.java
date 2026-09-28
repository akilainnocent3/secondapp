package defpackage;

import android.widget.TextView;
import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hd90 {

    public static final class a extends hd90 {
        public final TextView a;
        public final hw80 b;
        public final gd90.a c;
        public final gd90.a d;

        public a(SHOverBetComponent sHOverBetComponent, TextView textView) {
            sHOverBetComponent.getClass();
            this.a = textView;
            this.b = sHOverBetComponent.getBinding().e;
            this.c = new gd90.a(sHOverBetComponent.getBinding().b);
            this.d = new gd90.a(sHOverBetComponent.getBinding().c);
        }

        @Override // defpackage.hd90
        public final gd90 a() {
            return this.c;
        }

        @Override // defpackage.hd90
        public final gd90 b() {
            return this.d;
        }

        @Override // defpackage.hd90
        public final TextView c() {
            return this.a;
        }

        @Override // defpackage.hd90
        public final hw80 d() {
            return this.b;
        }
    }

    public static final class b extends hd90 {
        public final TextView a;
        public final hw80 b;
        public final gd90.b c;
        public final gd90.b d;

        public b(SHRangeComponent sHRangeComponent, TextView textView) {
            sHRangeComponent.getClass();
            this.a = textView;
            this.b = sHRangeComponent.getBinding().e;
            this.c = new gd90.b(sHRangeComponent.getBinding().c);
            this.d = new gd90.b(sHRangeComponent.getBinding().d);
        }

        @Override // defpackage.hd90
        public final gd90 a() {
            return this.c;
        }

        @Override // defpackage.hd90
        public final gd90 b() {
            return this.d;
        }

        @Override // defpackage.hd90
        public final TextView c() {
            return this.a;
        }

        @Override // defpackage.hd90
        public final hw80 d() {
            return this.b;
        }
    }

    public abstract gd90 a();

    public abstract gd90 b();

    public abstract TextView c();

    public abstract hw80 d();

    public final gd90 e(boolean z) {
        return z ? a() : b();
    }
}
