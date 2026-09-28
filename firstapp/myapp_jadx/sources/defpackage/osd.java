package defpackage;

import android.os.SystemClock;
import com.sporty.android.common_ui.widgets.CombEditText;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class osd implements CombEditText.d, nv5.c {
    public final /* synthetic */ Object a;

    @Override // nv5.c
    public Object a(final nv5.a aVar) {
        final xjs xjsVar = (xjs) this.a;
        ((adl) mku.a()).execute(new Runnable() { // from class: wjs
            @Override // java.lang.Runnable
            public final void run() {
                xjs.a aVar2 = (xjs.a) xjsVar.a.d();
                nv5.a aVar3 = aVar;
                if (aVar2 == null) {
                    aVar3.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                } else {
                    aVar3.b(aVar2.a);
                }
            }
        });
        return xjsVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // com.sporty.android.common_ui.widgets.CombEditText.d
    public void l(CharSequence charSequence) {
        usd usdVar = (usd) this.a;
        usdVar.S0().P1(StringsKt.t0(charSequence.toString()).toString());
    }
}
