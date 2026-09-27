package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ti0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f155922a;

    public /* synthetic */ ti0(Context context) {
        this(new rw0(context.getApplicationContext()));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typefaceA = this.f155922a.f155170b.a(sw0.f155582b);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getBold() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        Typeface typefaceA = this.f155922a.f155170b.a(sw0.f155583c);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getLight() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        Typeface typefaceA = this.f155922a.f155170b.a(sw0.f155584d);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getMedium() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        Typeface typefaceA = this.f155922a.f155170b.a(sw0.f155585e);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getRegular() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* synthetic */ Typeface getTypefaceFor(int i10) {
        return com.yandex.div.core.font.a.a(this, i10);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* synthetic */ boolean isVariable() {
        return com.yandex.div.core.font.a.b(this);
    }

    public ti0(rw0 rw0Var) {
        this.f155922a = rw0Var;
    }
}
