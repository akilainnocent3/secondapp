package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public TextView f7251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextClassifier f7252b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static final class a {
        @NonNull
        @k.t
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public p0(@NonNull TextView textView) {
        this.f7251a = (TextView) e2.x.l(textView);
    }

    @NonNull
    @k.t0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f7252b;
        return textClassifier == null ? a.a(this.f7251a) : textClassifier;
    }

    @k.t0(api = 26)
    public void b(@Nullable TextClassifier textClassifier) {
        this.f7252b = textClassifier;
    }
}
