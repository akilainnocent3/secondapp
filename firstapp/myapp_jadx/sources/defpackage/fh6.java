package defpackage;

import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public final class fh6 {
    public static void a(CardView.a aVar, float f) {
        mz50 mz50Var = aVar.a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f != mz50Var.e || mz50Var.f != useCompatPadding || mz50Var.g != preventCornerOverlap) {
            mz50Var.e = f;
            mz50Var.f = useCompatPadding;
            mz50Var.g = preventCornerOverlap;
            mz50Var.b(null);
            mz50Var.invalidateSelf();
        }
        b(aVar);
    }

    public static void b(gh6 gh6Var) {
        float f;
        float f2;
        if (!CardView.this.getUseCompatPadding()) {
            ((CardView.a) gh6Var).a(0, 0, 0, 0);
            return;
        }
        CardView.a aVar = (CardView.a) gh6Var;
        mz50 mz50Var = aVar.a;
        float f3 = mz50Var.e;
        float f4 = mz50Var.a;
        CardView cardView = CardView.this;
        if (cardView.getPreventCornerOverlap()) {
            f = (float) (((1.0d - nz50.a) * ((double) f4)) + ((double) f3));
        } else {
            int i = nz50.b;
            f = f3;
        }
        int iCeil = (int) Math.ceil(f);
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - nz50.a) * ((double) f4)) + ((double) (f3 * 1.5f)));
        } else {
            f2 = f3 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f2);
        aVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
