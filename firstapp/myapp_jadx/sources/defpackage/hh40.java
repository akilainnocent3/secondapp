package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.sportyherov2.components.ShMultiplierContainer;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hh40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hh40(ShMultiplierContainer shMultiplierContainer) {
        this.a = 1;
        this.b = shMultiplierContainer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yh40.a((String) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                ShMultiplierContainer shMultiplierContainer = (ShMultiplierContainer) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ((x5a0) srw.b).getValue()).booleanValue();
                    boolean zD = srw.d();
                    File atlasName = shMultiplierContainer.getAtlasName();
                    File skeletonName = shMultiplierContainer.getSkeletonName();
                    String str = shMultiplierContainer.I;
                    boolean zA = aVar.A(shMultiplierContainer);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new jh40(shMultiplierContainer, i2);
                        aVar.r(objY);
                    }
                    gw80.a(zBooleanValue, zD, atlasName, skeletonName, str, (Function1) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                eqg0.c((d) obj3, (a) obj, qj40.a(7));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hh40(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}
