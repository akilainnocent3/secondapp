package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import com.sportygames.commons.views.a;

/* JADX INFO: loaded from: classes7.dex */
public final class upy extends yxi {
    public final a y;
    public final DynamicOnboardingScreenBasicBase[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upy(a aVar, DynamicOnboardingScreenBasicBase[] dynamicOnboardingScreenBasicBaseArr, a aVar2) {
        super(aVar);
        dynamicOnboardingScreenBasicBaseArr.getClass();
        this.y = aVar2;
        this.z = dynamicOnboardingScreenBasicBaseArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.z.length;
    }

    @Override // defpackage.yxi
    public final Fragment k(int i) {
        DynamicOnboardingScreenBasicBase[] dynamicOnboardingScreenBasicBaseArr = this.z;
        dynamicOnboardingScreenBasicBaseArr.getClass();
        a aVar = this.y;
        aVar.getClass();
        opy opyVar = new opy();
        opyVar.c = i;
        opyVar.e = dynamicOnboardingScreenBasicBaseArr;
        opyVar.d = aVar;
        return opyVar;
    }
}
