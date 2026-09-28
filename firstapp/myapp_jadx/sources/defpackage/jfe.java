package defpackage;

import android.widget.ImageView;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jfe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jfe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j6c j6cVar = (j6c) obj;
                j6cVar.getClass();
                ((au7) ((tfe) obj2).y.getValue()).x1(j6cVar);
                break;
            default:
                Boolean bool = (Boolean) obj;
                ImageView imageView = (ImageView) ((VirtualLobbyActivity) obj2).w.get("Me");
                if (imageView != null) {
                    bool.getClass();
                    imageView.setVisibility(bool.booleanValue() ? 0 : 8);
                }
                break;
        }
        return Unit.a;
    }
}
