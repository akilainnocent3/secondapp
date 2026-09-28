package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.protobuf.DescriptorProtos;
import com.sportygames.pocketrocket.component.RoundDetailBetList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.component.RoundDetailBetList$fillData$1", f = "RoundDetailBetList.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class iy50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public AppCompatImageView a;
    public int b;
    public final /* synthetic */ RoundDetailBetList c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy50(v1b v1bVar, RoundDetailBetList roundDetailBetList, String str) {
        super(2, v1bVar);
        this.c = roundDetailBetList;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new iy50(v1bVar, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iy50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            RoundDetailBetList roundDetailBetList = this.c;
            AppCompatImageView appCompatImageView2 = roundDetailBetList.getBinding().b;
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = roundDetailBetList.getContext();
            this.a = appCompatImageView2;
            this.b = 1;
            obj = r9n.c(this, context, this.d);
            if (obj == y5bVar) {
                return y5bVar;
            }
            appCompatImageView = appCompatImageView2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            appCompatImageView = this.a;
            uj50.b(obj);
        }
        appCompatImageView.setImageBitmap((Bitmap) obj);
        return Unit.a;
    }
}
