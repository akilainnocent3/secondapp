package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v80 implements Function2 {
    public final /* synthetic */ ytw a;

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        owo owoVar = (owo) obj;
        owo owoVar2 = (owo) obj2;
        int i = owoVar2.a;
        int i2 = owoVar2.d;
        int i3 = owoVar2.c;
        int i4 = owoVar2.b;
        int i5 = owoVar.c;
        int i6 = owoVar.b;
        int i7 = owoVar.d;
        int i8 = owoVar.a;
        float fMin2 = 1.0f;
        if (i >= i5) {
            fMin = 0.0f;
        } else if (i3 <= i8) {
            fMin = 1.0f;
        } else if (owoVar2.d() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(owoVar.c, i3) + Math.max(i8, i)) / 2) - i) / owoVar2.d();
        }
        if (i4 >= i7) {
            fMin2 = 0.0f;
        } else if (i2 > i6) {
            if (owoVar2.b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i7, i2) + Math.max(i6, i4)) / 2) - i4) / owoVar2.b();
            }
        }
        this.a.setValue(new jsg0(n09.a(fMin, fMin2)));
        return Unit.a;
    }
}
