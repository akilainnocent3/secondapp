package defpackage;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.CountdownTimerKt$CountdownTimer$1$1", f = "CountdownTimer.kt", l = {24}, m = "invokeSuspend", v = 1)
public final class q6b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ytw<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6b(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q6b(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((q6b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            String str = "00:00";
            String str2 = this.b;
            str2.getClass();
            try {
                if (str2.length() == 0) {
                    str = "";
                } else {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
                    Date date = simpleDateFormat.parse(str2);
                    String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
                    str3.getClass();
                    Date date2 = simpleDateFormat.parse(str3);
                    long time = (date != null ? date.getTime() : 0L) - (date2 != null ? date2.getTime() : 0L);
                    if (time > 0) {
                        long j = time / 86400000;
                        long j2 = (time / 3600000) % 24;
                        long j3 = (time / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60;
                        long j4 = (time / 1000) % 60;
                        if (j > 0) {
                            str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}, 3));
                        } else {
                            str = j2 > 0 ? String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.c.setValue(str);
            this.a = 1;
        } while (hkd.b(1000L, this) != y5bVar);
        return y5bVar;
    }
}
