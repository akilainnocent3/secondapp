package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.lobby.remote.models.UpdateFavouriteRequest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.repositories.FavouriteUpdateDataSource$loadInitial$1", f = "FavouriteUpdateDataSource.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class hbh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibh b;
    public final /* synthetic */ unz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbh(ibh ibhVar, unz unzVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ibhVar;
        this.c = unzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hbh(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hbh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        boolean z;
        Long minimumSdkVersion;
        String nativeSupportVersion;
        Integer bizCode;
        ibh ibhVar = this.b;
        ssw<LoadingState<List<GameDetails>>> sswVar = ibhVar.g;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = ibhVar.d;
                UpdateFavouriteRequest updateFavouriteRequest = ibhVar.e;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new txi0(updateFavouriteRequest, null), null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objD = obj;
            }
            ResultWrapper resultWrapper = (ResultWrapper) objD;
            if (resultWrapper instanceof ResultWrapper.Success) {
                long versionCode = SportyGamesManager.getInstance().getVersionCode();
                List arrayList = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                ArrayList arrayList2 = new ArrayList();
                if (((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData() != null || ((bizCode = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getBizCode()) != null && bizCode.intValue() == 10000)) {
                    Integer total = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getTotal();
                    ibhVar.h = total != null ? total.intValue() : 0;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Integer launchRate = ((GameDetails) list.get(i2)).getLaunchRate();
                        String strValueOf = String.valueOf(((GameDetails) list.get(i2)).getName());
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
                        int i3 = (((GameDetails) list.get(i2)).getNativeSupportVersion() == null || (nativeSupportVersion = ((GameDetails) list.get(i2)).getNativeSupportVersion()) == null) ? 0 : Integer.parseInt(nativeSupportVersion);
                        if (launchRate != null && launchRate.intValue() > 0 && z && ibhVar.f >= i3) {
                            LobbyMetaInfo metaInfo = ((GameDetails) list.get(i2)).getMetaInfo();
                            if (versionCode >= ((metaInfo == null || (minimumSdkVersion = metaInfo.getMinimumSdkVersion()) == null) ? 0L : minimumSdkVersion.longValue())) {
                                arrayList2.add(list.get(i2));
                            }
                        }
                    }
                    sswVar.j(new LoadingState<>(Status.SUCCESS, arrayList2, null, null, null, 16, null));
                    unz unzVar = this.c;
                    List list2 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                    unzVar.a(arrayList2, list2 != null ? new Integer(list2.size()) : null);
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
