package p2;

import androidx.cardview.widget.CardView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @androidx.databinding.g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @androidx.databinding.g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @androidx.databinding.g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@y0({y0.a.LIBRARY})
public class h {
    @androidx.databinding.d({"contentPadding"})
    public static void a(CardView cardView, int i10) {
        cardView.h(i10, i10, i10, i10);
    }

    @androidx.databinding.d({"contentPaddingBottom"})
    public static void b(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i10);
    }

    @androidx.databinding.d({"contentPaddingLeft"})
    public static void c(CardView cardView, int i10) {
        cardView.h(i10, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @androidx.databinding.d({"contentPaddingRight"})
    public static void d(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i10, cardView.getContentPaddingBottom());
    }

    @androidx.databinding.d({"contentPaddingTop"})
    public static void e(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), i10, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
