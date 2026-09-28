package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sportygames.fruithunt.network.models.FruitItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.utils.objects.FruitAssets$getCutFruitRightRotten$2", f = "FruitAssets.kt", l = {300, 305, 310, 315, 320, 325, 330, 335, 340, 345, 350, 355, 360, 365, 370}, m = "invokeSuspend", v = 1)
public final class e0j extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public int a;
    public final /* synthetic */ FruitItem.FruitRecord b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0j(FruitItem.FruitRecord fruitRecord, Context context, v1b<? super e0j> v1bVar) {
        super(2, v1bVar);
        this.b = fruitRecord;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e0j(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((e0j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0191, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ae, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c9, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e4, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ff, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0219, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0159, code lost:
    
        if (r5 == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0175, code lost:
    
        if (r5 == r0) goto L145;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
