package p2;

import android.widget.RatingBar;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:rating", type = RatingBar.class)})
@y0({y0.a.LIBRARY})
public class w {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RatingBar.OnRatingBarChangeListener f120375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120376b;

        public a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
            this.f120375a = onRatingBarChangeListener;
            this.f120376b = oVar;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f10, boolean z10) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f120375a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f10, z10);
            }
            this.f120376b.a();
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, oVar));
        }
    }

    @androidx.databinding.d({"android:rating"})
    public static void b(RatingBar ratingBar, float f10) {
        if (ratingBar.getRating() != f10) {
            ratingBar.setRating(f10);
        }
    }
}
