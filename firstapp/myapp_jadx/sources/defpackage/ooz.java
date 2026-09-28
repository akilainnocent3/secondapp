package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ooz implements gaj {
    public final /* synthetic */ zpz a;
    public final /* synthetic */ asr b;

    public /* synthetic */ ooz(zpz zpzVar, asr asrVar) {
        this.a = zpzVar;
        this.b = asrVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        zpz zpzVar = this.a;
        boolean zB = upz.b(zpzVar, fFloatValue);
        char c = 0;
        if (zpzVar.m().a() != i3z.a) {
            if (this.b != asr.a) {
                zB = !zB;
            }
        }
        int iJ = zpzVar.m().j();
        float fA = iJ == 0 ? 0.0f : upz.a(zpzVar) / iJ;
        float f = fA - ((int) fA);
        if (Math.abs(fFloatValue) >= zpzVar.q.C1(400.0f)) {
            c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
        }
        if (c == 0) {
            if (Math.abs(f) <= 0.5f) {
                float fAbs = Math.abs(fA);
                mmd mmdVar = zpzVar.q;
                npz npzVar = eqz.a;
                if (fAbs < Math.abs(Math.min(mmdVar.C1(56.0f), zpzVar.o() / 2.0f) / zpzVar.o()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zB) {
                    fFloatValue2 = fFloatValue3;
                }
            } else if (zB) {
                fFloatValue2 = fFloatValue3;
            }
        } else if (c == 1) {
            fFloatValue2 = fFloatValue3;
        } else if (c != 2) {
            fFloatValue2 = 0.0f;
        }
        return Float.valueOf(fFloatValue2);
    }
}
