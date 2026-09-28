package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sportygames.featuredGames.view.FeaturedGames;
import com.sportygames.sportyherov2.components.ShBetContainer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class feh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ feh(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                FeaturedGames featuredGames = (FeaturedGames) viewGroup;
                Integer num = (Integer) obj;
                ArrayList arrayList = featuredGames.w;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    try {
                        qch qchVar = featuredGames.f;
                        if (qchVar != null) {
                            qchVar.j(i2, num != null && i2 == num.intValue());
                        }
                    } catch (Exception unused) {
                    }
                    i2 = i4;
                }
                return Unit.a;
            default:
                ShBetContainer shBetContainer = (ShBetContainer) viewGroup;
                int i5 = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        if (shBetContainer.binding.O.getAlpha() == 1.0f) {
                            shBetContainer.binding.Z.setVisibility(0);
                        }
                        shBetContainer.binding.S.setVisibility(8);
                        shBetContainer.binding.U.setVisibility(8);
                        shBetContainer.binding.W.setVisibility(8);
                        shBetContainer.binding.Y.setVisibility(8);
                        Function1<? super Boolean, Unit> function1 = shBetContainer.g0;
                        if (function1 == null) {
                            Intrinsics.n("onFbgClick");
                            throw null;
                        }
                        function1.invoke(Boolean.TRUE);
                        shBetContainer.getOnBetChipSelected().invoke(0);
                        return Unit.a;
                    }
                    return Unit.a;
                } catch (Exception unused2) {
                }
                break;
        }
    }
}
