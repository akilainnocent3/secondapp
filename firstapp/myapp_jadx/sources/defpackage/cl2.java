package defpackage;

import android.view.View;
import com.sportygames.pocketrocket.component.BetContainer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cl2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cl2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                BetContainer betContainer = (BetContainer) obj3;
                Function0 function0 = (Function0) obj2;
                int i2 = BetContainer.R;
                ((View) obj).getClass();
                if (!betContainer.d()) {
                    betContainer.setCashoutAmount(Double.parseDouble(betContainer.a.z.getText().toString()));
                    function0.invoke();
                }
                break;
            default:
                List list = (List) obj3;
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                float fMax = Math.max(Float.intBitsToFloat((int) (tcfVar.d() >> 32)), Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                float fB = vcv.b(-fMax, 2.0f * fMax, ((Number) ((twd0) obj2).getValue()).floatValue());
                float f = (fMax * 0.3f) + fB;
                tcf.V1(tcfVar, new hfs(list, null, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                break;
        }
        return Unit.a;
    }
}
