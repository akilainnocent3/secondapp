package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sportygames.fruithunt.network.models.FruitItem;
import com.sportygames.fruithunt.utils.objects.FruitMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$onResultRotten$1", f = "FruitHuntFragment.kt", l = {1507, 1509}, m = "invokeSuspend", v = 1)
public final class q7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public FruitMap a;
    public u6j b;
    public Context c;
    public float d;
    public int e;
    public int f;
    public final /* synthetic */ u6j i;
    public final /* synthetic */ FruitMap v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7j(u6j u6jVar, FruitMap fruitMap, float f, v1b<? super q7j> v1bVar) {
        super(2, v1bVar);
        this.i = u6jVar;
        this.v = fruitMap;
        this.w = f;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q7j(this.i, this.v, this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        FruitMap fruitMap;
        u6j u6jVar;
        float f;
        Context context;
        int i;
        FruitMap fruitMap2;
        float f2;
        u6j u6jVar2;
        Bitmap bitmap;
        y5b y5bVar = y5b.a;
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.e;
                f = this.d;
                Context context2 = this.c;
                u6jVar = this.b;
                FruitMap fruitMap3 = this.a;
                uj50.b(obj);
                i = i3;
                fruitMap = fruitMap3;
                context = context2;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f2 = this.d;
                u6jVar2 = this.b;
                fruitMap2 = this.a;
                uj50.b(obj);
            }
            bitmap = (Bitmap) obj;
            if (bitmap != null) {
                u6jVar2.t1(fruitMap2, f2, bitmap);
                u6jVar2.a1(false);
            }
            return Unit.a;
        }
        uj50.b(obj);
        u6j u6jVar3 = this.i;
        Context context3 = u6jVar3.getContext();
        if (context3 != null) {
            fruitMap = this.v;
            FruitItem.FruitRecord fruitItem = fruitMap.getFruitItem();
            this.a = fruitMap;
            this.b = u6jVar3;
            this.c = context3;
            float f3 = this.w;
            this.d = f3;
            this.e = 0;
            this.f = 1;
            pfd pfdVar = fse.a;
            Object objD = ej5.d(odd.b, new c0j(fruitItem, context3, null), this);
            if (objD != y5bVar) {
                u6jVar = u6jVar3;
                obj = objD;
                f = f3;
                context = context3;
                i = 0;
            }
            return y5bVar;
        }
        return Unit.a;
        Bitmap bitmap2 = (Bitmap) obj;
        if (bitmap2 != null) {
            u6jVar.s1(fruitMap, f, bitmap2);
            FruitItem.FruitRecord fruitItem2 = fruitMap.getFruitItem();
            this.a = fruitMap;
            this.b = u6jVar;
            this.c = null;
            this.d = f;
            this.e = i;
            this.f = 2;
            pfd pfdVar2 = fse.a;
            obj = ej5.d(odd.b, new e0j(fruitItem2, context, null), this);
            if (obj != y5bVar) {
                fruitMap2 = fruitMap;
                f2 = f;
                u6jVar2 = u6jVar;
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    u6jVar2.t1(fruitMap2, f2, bitmap);
                    u6jVar2.a1(false);
                }
            }
            return y5bVar;
        }
        return Unit.a;
    }
}
