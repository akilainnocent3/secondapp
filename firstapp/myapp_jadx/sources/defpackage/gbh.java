package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.repositories.FavouriteUpdateDataSource$loadAfter$1", f = "FavouriteUpdateDataSource.kt", l = {129}, m = "invokeSuspend", v = 1)
public final class gbh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ snz.d<Integer> b;
    public final /* synthetic */ ibh c;
    public final /* synthetic */ tnz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbh(snz.d dVar, ibh ibhVar, tnz tnzVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = dVar;
        this.c = ibhVar;
        this.d = tnzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gbh(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gbh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        boolean z;
        Long minimumSdkVersion;
        String nativeSupportVersion;
        Integer bizCode;
        Integer num = this.b.a;
        ibh ibhVar = this.c;
        ssw<LoadingState<List<GameDetails>>> sswVar = ibhVar.g;
        y5b y5bVar = y5b.a;
        int i = this.a;
        Integer num2 = null;
        try {
            if (i == 0) {
                uj50.b(obj);
                if (num.intValue() < ibhVar.h) {
                    sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                    uxi0 uxi0Var = ibhVar.d;
                    int iIntValue = num.intValue();
                    Integer num3 = new Integer(20);
                    this.a = 1;
                    uxi0Var.getClass();
                    objA = uxi0.a(iIntValue, num3, this);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = obj;
            ResultWrapper resultWrapper = (ResultWrapper) objA;
            if (resultWrapper instanceof ResultWrapper.Success) {
                long versionCode = SportyGamesManager.getInstance().getVersionCode();
                List arrayList = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList();
                List list = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                int size = list != null ? list.size() : 0;
                int iIntValue2 = num.intValue();
                Integer total = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getTotal();
                if (total == null || iIntValue2 != total.intValue()) {
                    num2 = new Integer(num.intValue() + size);
                }
                if (((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData() != null || ((bizCode = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getBizCode()) != null && bizCode.intValue() == 10000)) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Integer launchRate = ((GameDetails) arrayList.get(i2)).getLaunchRate();
                        String strValueOf = String.valueOf(((GameDetails) arrayList.get(i2)).getName());
                        if (launchRate != null) {
                            try {
                                if (new brr().a(launchRate.intValue(), strValueOf)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } catch (NoSuchAlgorithmException e) {
                                e.printStackTrace();
                            }
                        } else {
                            z = false;
                        }
                        int i3 = (((GameDetails) arrayList.get(i2)).getNativeSupportVersion() == null || (nativeSupportVersion = ((GameDetails) arrayList.get(i2)).getNativeSupportVersion()) == null) ? 0 : Integer.parseInt(nativeSupportVersion);
                        if (launchRate != null && launchRate.intValue() > 0 && z && ibhVar.f >= i3) {
                            LobbyMetaInfo metaInfo = ((GameDetails) arrayList.get(i2)).getMetaInfo();
                            if (versionCode >= ((metaInfo == null || (minimumSdkVersion = metaInfo.getMinimumSdkVersion()) == null) ? 0L : minimumSdkVersion.longValue())) {
                                arrayList2.add(arrayList.get(i2));
                            }
                        }
                    }
                    sswVar.j(new LoadingState<>(Status.SUCCESS, arrayList2, null, null, null, 16, null));
                    if (!arrayList2.isEmpty()) {
                        this.d.a(arrayList2, num2);
                    }
                }
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return Unit.a;
    }
}
