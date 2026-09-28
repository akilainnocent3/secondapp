package defpackage;

import androidx.compose.animation.g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a8g extends qlr implements Function1<w7g, Float> {
    public final /* synthetic */ s9g a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8g(s9g s9gVar, g gVar) {
        super(1);
        this.a = s9gVar;
        this.b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(w7g w7gVar) {
        int iOrdinal = w7gVar.ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            o8h o8hVar = this.a.a().a;
            if (o8hVar != null) {
                f = o8hVar.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            o8h o8hVar2 = this.b.a().a;
            if (o8hVar2 != null) {
                f = o8hVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
