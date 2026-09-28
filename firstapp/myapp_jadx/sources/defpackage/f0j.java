package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sportygames.fruithunt.network.models.FruitItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.utils.objects.FruitAssets$getFruitImage$2", f = "FruitAssets.kt", l = {86, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 1)
public final class f0j extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public int a;
    public final /* synthetic */ FruitItem.FruitRecord b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0j(FruitItem.FruitRecord fruitRecord, Context context, v1b<? super f0j> v1bVar) {
        super(2, v1bVar);
        this.b = fruitRecord;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f0j(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((f0j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a3, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01be, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d9, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f3, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fa, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0132, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016b, code lost:
    
        if (r5 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0187, code lost:
    
        if (r5 == r0) goto L132;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
