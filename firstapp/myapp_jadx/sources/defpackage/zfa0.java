package defpackage;

import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class zfa0 {
    public static final List<d9a0> a(List<SocialFollowData> list, Function1<? super String, String> function1) {
        ArrayList arrayList;
        String strInvoke;
        dja0 dja0VarA;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (SocialFollowData socialFollowData : list) {
                String nickname = socialFollowData.getNickname();
                String avatar = socialFollowData.getAvatar();
                if (avatar == null || (strInvoke = function1.invoke(avatar)) == null) {
                    strInvoke = "";
                }
                boolean zIsFollowed = socialFollowData.isFollowed();
                int followersCount = socialFollowData.getFollowersCount();
                String userId = socialFollowData.getUserId();
                String str = userId == null ? "" : userId;
                String userType = socialFollowData.getUserType();
                if (userType == null || (dja0VarA = laa0.a(userType)) == null) {
                    dja0VarA = dja0.b;
                }
                arrayList.add(new d9a0(nickname, strInvoke, false, zIsFollowed, dja0VarA, socialFollowData.isFollowed() ? y7i.a.a : y7i.c.a, Integer.valueOf(followersCount), str, 1408));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? m2g.a : arrayList;
    }
}
