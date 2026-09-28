package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.fruithunt.utils.objects.FruitAssets$getFruitImageBetHistory$2", f = "FruitAssets.kt", l = {384, 385, 390, 395, 400, 405, 406, 407, 408, 413, 418, 419, 424, 429, 434}, m = "invokeSuspend", v = 1)
public final class g0j extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0j(v1b v1bVar, Context context, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g0j(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((g0j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0185, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a2, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bd, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d9, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f4, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x020e, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0210, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0114, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0130, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
    
        if (r5 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0169, code lost:
    
        if (r5 == r0) goto L141;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
