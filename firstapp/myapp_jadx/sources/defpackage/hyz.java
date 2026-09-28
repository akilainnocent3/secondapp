package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.DeviceModel;
import com.sporty.android.core.model.patron.DeviceStatusDto;
import com.sporty.android.core.model.patron.DevicesFeatureConfigResponse;
import com.sporty.android.core.model.patron.DevicesResponse;
import com.sporty.android.core.model.patron.TooltipType;
import com.sporty.android.core.model.patron.TooltipVisibilityResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class hyz implements byz {
    public final zxz a;
    public final yxz b;

    public hyz(zxz zxzVar, yxz yxzVar) {
        zxzVar.getClass();
        yxzVar.getClass();
        this.a = zxzVar;
        this.b = yxzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.byz
    public final Object a(int i, int i2, x1b x1bVar, List list) {
        eyz eyzVar;
        String str;
        wk10 wk10Var;
        char c;
        aie aieVar;
        if (x1bVar instanceof eyz) {
            eyzVar = (eyz) x1bVar;
            int i3 = eyzVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eyzVar.c = i3 - Integer.MIN_VALUE;
            } else {
                eyzVar = new eyz(this, x1bVar);
            }
        } else {
            eyzVar = new eyz(this, x1bVar);
        }
        Object objA = eyzVar.a;
        y5b y5bVar = y5b.a;
        int i4 = eyzVar.c;
        Integer num = null;
        if (i4 == 0) {
            uj50.b(objA);
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceStatusDto deviceStatusDto = (DeviceStatusDto) it.next();
                deviceStatusDto.getClass();
                int i5 = bie.a[deviceStatusDto.ordinal()];
                if (i5 == 1) {
                    str = AnalyticsEvent.LOGIN;
                } else if (i5 == 2) {
                    str = "LOGOUT";
                } else if (i5 == 3) {
                    str = "FORCE_LOGOUT";
                } else {
                    if (i5 != 4) {
                        uhc.a();
                        return null;
                    }
                    str = "BLOCKED";
                }
                arrayList.add(str);
            }
            eyzVar.c = 1;
            objA = this.a.a(arrayList, i, i2, eyzVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        BaseResponse baseResponse = (BaseResponse) objA;
        this.b.getClass();
        baseResponse.getClass();
        List<DeviceModel> entityList = ((DevicesResponse) baseResponse.data).getEntityList();
        int pageNo = ((DevicesResponse) baseResponse.data).getPageNo();
        int totalPages = ((DevicesResponse) baseResponse.data).getTotalPages();
        int totalNum = ((DevicesResponse) baseResponse.data).getTotalNum();
        ArrayList arrayList2 = new ArrayList(l48.r(entityList, 10));
        for (DeviceModel deviceModel : entityList) {
            String location = deviceModel.getLocation();
            String device = deviceModel.getDevice();
            String deviceId = deviceModel.getDeviceId();
            int inactiveDays = deviceModel.getInactiveDays();
            Integer numValueOf = inactiveDays > 0 ? Integer.valueOf(inactiveDays) : num;
            String ip = deviceModel.getIp();
            String phoneModel = deviceModel.getPhoneModel();
            Integer num2 = num;
            String lowerCase = deviceModel.getPlatform().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase) {
                case "android":
                    wk10Var = wk10.a;
                    break;
                case "ios":
                    wk10Var = wk10.b;
                    break;
                case "wap":
                    wk10Var = wk10.d;
                    break;
                case "web":
                    wk10Var = wk10.c;
                    break;
                default:
                    wk10Var = wk10.e;
                    break;
            }
            wk10 wk10Var2 = wk10Var;
            int i6 = yxz.a.a[deviceModel.getStatus().ordinal()];
            if (i6 == 1) {
                c = 4;
                aieVar = deviceModel.getCurrentDevice() ? aie.a : aie.b;
            } else if (i6 == 2 || i6 == 3) {
                c = 4;
                aieVar = aie.c;
            } else {
                c = 4;
                if (i6 != 4) {
                    uhc.a();
                    return num2;
                }
                aieVar = aie.d;
            }
            aie aieVar2 = aieVar;
            Long lS0 = StringsKt.s0(deviceModel.getUpdateTime());
            arrayList2.add(new mbe(location, device, deviceId, numValueOf, ip, phoneModel, wk10Var2, aieVar2, lS0 != null ? lS0.longValue() : 0L));
            num = num2;
        }
        return new gie(pageNo, totalPages, totalNum, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.byz
    public final Object b(x1b x1bVar) {
        gyz gyzVar;
        if (x1bVar instanceof gyz) {
            gyzVar = (gyz) x1bVar;
            int i = gyzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyzVar.c = i - Integer.MIN_VALUE;
            } else {
                gyzVar = new gyz(this, x1bVar);
            }
        } else {
            gyzVar = new gyz(this, x1bVar);
        }
        Object obj = gyzVar.a;
        y5b y5bVar = y5b.a;
        int i2 = gyzVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            gyzVar.c = 1;
            if (this.a.b(gyzVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.byz
    public final yzh c(String str, List list) {
        list.getClass();
        return bm50.a(new or60(new fyz(this, list, str, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.byz
    public final Object d(x1b x1bVar) {
        dyz dyzVar;
        if (x1bVar instanceof dyz) {
            dyzVar = (dyz) x1bVar;
            int i = dyzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyzVar.c = i - Integer.MIN_VALUE;
            } else {
                dyzVar = new dyz(this, x1bVar);
            }
        } else {
            dyzVar = new dyz(this, x1bVar);
        }
        Object objD = dyzVar.a;
        y5b y5bVar = y5b.a;
        int i2 = dyzVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            dyzVar.c = 1;
            objD = this.a.d(dyzVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        BaseResponse baseResponse = (BaseResponse) objD;
        this.b.getClass();
        baseResponse.getClass();
        DevicesFeatureConfigResponse devicesFeatureConfigResponse = (DevicesFeatureConfigResponse) baseResponse.data;
        return Boolean.valueOf(devicesFeatureConfigResponse != null ? devicesFeatureConfigResponse.getMainSwitch() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.byz
    public final Object e(TooltipType tooltipType, x1b x1bVar) {
        cyz cyzVar;
        if (x1bVar instanceof cyz) {
            cyzVar = (cyz) x1bVar;
            int i = cyzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cyzVar.c = i - Integer.MIN_VALUE;
            } else {
                cyzVar = new cyz(this, x1bVar);
            }
        } else {
            cyzVar = new cyz(this, x1bVar);
        }
        Object objC = cyzVar.a;
        y5b y5bVar = y5b.a;
        int i2 = cyzVar.c;
        if (i2 == 0) {
            uj50.b(objC);
            cyzVar.c = 1;
            objC = this.a.c(tooltipType, cyzVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        return Boolean.valueOf(((TooltipVisibilityResponse) n52.b((BaseResponse) objC)).getShowTip());
    }
}
