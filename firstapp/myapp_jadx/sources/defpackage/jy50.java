package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportygames.pocketrocket.component.RoundDetailBetList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.component.RoundDetailBetList$fillData$2", f = "RoundDetailBetList.kt", l = {49, 58, 67}, m = "invokeSuspend", v = 1)
public final class jy50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public AppCompatImageView a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ RoundDetailBetList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy50(v1b v1bVar, RoundDetailBetList roundDetailBetList, String str) {
        super(2, v1bVar);
        this.c = str;
        this.d = roundDetailBetList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jy50(v1bVar, this.d, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jy50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            String str = this.c;
            int iHashCode = str.hashCode();
            RoundDetailBetList roundDetailBetList = this.d;
            if (iHashCode != -1923613764) {
                if (iHashCode != 81009) {
                    if (iHashCode == 2041946 && str.equals("BLUE")) {
                        AppCompatImageView appCompatImageView4 = roundDetailBetList.getBinding().c;
                        s4u<String, Bitmap> s4uVar = r9n.a;
                        Context context = roundDetailBetList.getContext();
                        this.a = appCompatImageView4;
                        this.b = 1;
                        Object objC = r9n.c(this, context, "blue_rocket_with_fire_png");
                        if (objC != y5bVar) {
                            obj = objC;
                            appCompatImageView3 = appCompatImageView4;
                            appCompatImageView3.setImageBitmap((Bitmap) obj);
                        }
                        return y5bVar;
                    }
                } else if (str.equals("RED")) {
                    AppCompatImageView appCompatImageView5 = roundDetailBetList.getBinding().c;
                    s4u<String, Bitmap> s4uVar2 = r9n.a;
                    Context context2 = roundDetailBetList.getContext();
                    this.a = appCompatImageView5;
                    this.b = 3;
                    Object objC2 = r9n.c(this, context2, "red_rocket_with_fire_png");
                    if (objC2 != y5bVar) {
                        obj = objC2;
                        appCompatImageView2 = appCompatImageView5;
                        appCompatImageView2.setImageBitmap((Bitmap) obj);
                    }
                    return y5bVar;
                }
            } else if (str.equals("PURPLE")) {
                AppCompatImageView appCompatImageView6 = roundDetailBetList.getBinding().c;
                s4u<String, Bitmap> s4uVar3 = r9n.a;
                Context context3 = roundDetailBetList.getContext();
                this.a = appCompatImageView6;
                this.b = 2;
                Object objC3 = r9n.c(this, context3, "purple_rocket_with_fire_png");
                if (objC3 != y5bVar) {
                    obj = objC3;
                    appCompatImageView = appCompatImageView6;
                    appCompatImageView.setImageBitmap((Bitmap) obj);
                }
                return y5bVar;
            }
        } else if (i == 1) {
            appCompatImageView3 = this.a;
            uj50.b(obj);
            appCompatImageView3.setImageBitmap((Bitmap) obj);
        } else if (i == 2) {
            appCompatImageView = this.a;
            uj50.b(obj);
            appCompatImageView.setImageBitmap((Bitmap) obj);
        } else {
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            appCompatImageView2 = this.a;
            uj50.b(obj);
            appCompatImageView2.setImageBitmap((Bitmap) obj);
        }
        return Unit.a;
    }
}
