package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$cacheKnifeXY$1$1", f = "FruitHuntFragment.kt", l = {1193}, m = "invokeSuspend", v = 1)
public final class w6j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;
    public final /* synthetic */ AppCompatImageView c;

    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$cacheKnifeXY$1$1$1", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ u6j a;
        public final /* synthetic */ AppCompatImageView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u6j u6jVar, AppCompatImageView appCompatImageView, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = u6jVar;
            this.b = appCompatImageView;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Integer num;
            Integer num2;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            a6h a6hVar = this.a.C0;
            a6hVar.getClass();
            HashMap<Integer, Pair<Integer, Integer>> map = a6hVar.e;
            if (map.isEmpty()) {
                AppCompatImageView appCompatImageView = this.b;
                a6hVar.c = appCompatImageView.getWidth();
                a6hVar.d = (int) (appCompatImageView.getHeight() * 0.58f);
                if (a6hVar.c != 0) {
                    map.clear();
                    int y = (int) appCompatImageView.getY();
                    int i = a6hVar.d + y;
                    Drawable drawable = appCompatImageView.getDrawable();
                    drawable.getClass();
                    Bitmap bitmapA = a6h.a(zdf.a(drawable), appCompatImageView.getRotation());
                    float width = bitmapA.getWidth() / (appCompatImageView.getRight() - appCompatImageView.getLeft());
                    float height = bitmapA.getHeight() / (appCompatImageView.getBottom() - appCompatImageView.getTop());
                    for (int top = appCompatImageView.getTop(); top < i; top++) {
                        int right = appCompatImageView.getRight();
                        for (int left = appCompatImageView.getLeft(); left < right; left++) {
                            int left2 = (int) ((left - appCompatImageView.getLeft()) * width);
                            int top2 = (int) ((top - appCompatImageView.getTop()) * height);
                            if (left2 >= 0 && left2 < bitmapA.getWidth() && top2 >= 0 && top2 < bitmapA.getHeight() && bitmapA.getPixel(left2, top2) != 0) {
                                int i2 = top - y;
                                if (map.containsKey(Integer.valueOf(i2))) {
                                    Pair<Integer, Integer> pair = map.get(Integer.valueOf(i2));
                                    Integer numValueOf = pair != null ? pair.a : null;
                                    Integer numValueOf2 = pair != null ? pair.b : null;
                                    if (pair != null && (num2 = pair.a) != null && left < num2.intValue()) {
                                        numValueOf = Integer.valueOf(left);
                                    }
                                    if (pair != null && (num = pair.b) != null && left > num.intValue()) {
                                        numValueOf2 = Integer.valueOf(left);
                                    }
                                    map.put(Integer.valueOf(i2), new Pair<>(numValueOf, numValueOf2));
                                } else {
                                    map.put(Integer.valueOf(i2), new Pair<>(Integer.valueOf(left), Integer.valueOf(left)));
                                }
                            }
                        }
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6j(u6j u6jVar, AppCompatImageView appCompatImageView, v1b<? super w6j> v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
        this.c = appCompatImageView;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w6j(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w6j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            a aVar = new a(this.b, this.c, null);
            this.a = 1;
            if (ej5.d(pfdVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
