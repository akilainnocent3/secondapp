package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.esotericsoftware.spine.android.b;
import com.sportygames.sportyherocompose.views.ShMultiplierContainer;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dih implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dih(ShMultiplierContainer shMultiplierContainer) {
        this.a = 2;
        this.b = shMultiplierContainer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                eih.b((d) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cmm.c((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final ShMultiplierContainer shMultiplierContainer = (ShMultiplierContainer) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ((x5a0) trw.b).getValue()).booleanValue();
                    boolean zG = trw.g();
                    File atlasName = shMultiplierContainer.getAtlasName();
                    File skeletonName = shMultiplierContainer.getSkeletonName();
                    String str = shMultiplierContainer.L;
                    boolean zA = aVar.A(shMultiplierContainer);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function1() { // from class: pu80
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                shMultiplierContainer.y = (b) obj4;
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    shMultiplierContainer.a(zBooleanValue, zG, atlasName, skeletonName, str, (Function1) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dih(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}
