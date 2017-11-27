package de.appplant.cordova.plugin.notification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.content.Context;
import android.util.Log;

import de.appplant.cordova.plugin.notification.Manager;

public class NotificationService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        // Wont be called as service is not bound
        return null;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        getNotificationMgr().clearAll();
    }

    /**
     * Notification manager instance.
     */
    private Manager getNotificationMgr() {
        return Manager.getInstance(getApplicationContext());
    }

}
