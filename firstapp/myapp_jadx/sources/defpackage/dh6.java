package defpackage;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.r;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;

/* JADX INFO: loaded from: classes8.dex */
public final class dh6 extends j0 {
    public int d;
    public int e;

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    @Override // androidx.recyclerview.widget.j0
    public final int[] b(RecyclerView.o oVar, View view) {
        char c;
        int i;
        if (oVar instanceof CardStackLayoutManager) {
            CardStackLayoutManager cardStackLayoutManager = (CardStackLayoutManager) oVar;
            bh6 bh6Var = cardStackLayoutManager.G;
            eh6 eh6Var = cardStackLayoutManager.H;
            if (cardStackLayoutManager.F(eh6Var.f) != null) {
                int translationX = (int) view.getTranslationX();
                int translationY = (int) view.getTranslationY();
                if (translationX != 0 || translationY != 0) {
                    float fAbs = Math.abs(translationX) / view.getWidth();
                    float fAbs2 = Math.abs(translationY) / view.getHeight();
                    int i2 = this.e;
                    int i3 = this.d;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    if (i2 < 1000) {
                        c = 3;
                    } else {
                        c = i2 < 5000 ? (char) 2 : (char) 1;
                    }
                    ch6.a aVar = ch6.a.d;
                    if (c != 1) {
                        float f = bh6Var.e;
                        if (f >= fAbs && f >= fAbs2) {
                            ch6 ch6Var = new ch6(aVar, cardStackLayoutManager);
                            ch6Var.a = eh6Var.f;
                            cardStackLayoutManager.S0(ch6Var);
                        } else if (bh6Var.f.contains(eh6Var.a())) {
                            eh6Var.g = eh6Var.f + 1;
                            qqe qqeVar = qqe.a;
                            new AccelerateInterpolator();
                            kke0 kke0Var = bh6Var.j;
                            qqe qqeVar2 = kke0Var.a;
                            if (c != 1) {
                                i = 100;
                            } else if (c != 2) {
                                i = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
                            } else {
                                if (c == 3) {
                                    throw null;
                                }
                                i = 500;
                            }
                            bh6Var.j = new kke0(qqeVar2, i, kke0Var.c);
                            this.d = 0;
                            this.e = 0;
                            ch6 ch6Var2 = new ch6(ch6.a.c, cardStackLayoutManager);
                            ch6Var2.a = eh6Var.f;
                            cardStackLayoutManager.S0(ch6Var2);
                        } else {
                            ch6 ch6Var3 = new ch6(aVar, cardStackLayoutManager);
                            ch6Var3.a = eh6Var.f;
                            cardStackLayoutManager.S0(ch6Var3);
                        }
                    } else if (bh6Var.f.contains(eh6Var.a())) {
                        eh6Var.g = eh6Var.f + 1;
                        qqe qqeVar3 = qqe.a;
                        new AccelerateInterpolator();
                        kke0 kke0Var2 = bh6Var.j;
                        qqe qqeVar4 = kke0Var2.a;
                        if (c != 1) {
                            i = 100;
                        } else if (c != 2) {
                            i = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
                        } else {
                            if (c == 3) {
                                throw null;
                            }
                            i = 500;
                        }
                        bh6Var.j = new kke0(qqeVar4, i, kke0Var2.c);
                        this.d = 0;
                        this.e = 0;
                        ch6 ch6Var4 = new ch6(ch6.a.c, cardStackLayoutManager);
                        ch6Var4.a = eh6Var.f;
                        cardStackLayoutManager.S0(ch6Var4);
                    } else {
                        ch6 ch6Var5 = new ch6(aVar, cardStackLayoutManager);
                        ch6Var5.a = eh6Var.f;
                        cardStackLayoutManager.S0(ch6Var5);
                    }
                }
            }
        }
        return new int[2];
    }

    @Override // androidx.recyclerview.widget.j0
    public final View d(RecyclerView.o oVar) {
        if (!(oVar instanceof CardStackLayoutManager)) {
            return null;
        }
        CardStackLayoutManager cardStackLayoutManager = (CardStackLayoutManager) oVar;
        View viewF = cardStackLayoutManager.F(cardStackLayoutManager.H.f);
        if (viewF == null) {
            return null;
        }
        int translationX = (int) viewF.getTranslationX();
        int translationY = (int) viewF.getTranslationY();
        if (translationX == 0 && translationY == 0) {
            return null;
        }
        return viewF;
    }

    @Override // androidx.recyclerview.widget.j0
    public final int e(RecyclerView.o oVar, int i, int i2) {
        this.d = Math.abs(i);
        this.e = Math.abs(i2);
        if (oVar instanceof CardStackLayoutManager) {
            return ((CardStackLayoutManager) oVar).H.f;
        }
        return -1;
    }
}
