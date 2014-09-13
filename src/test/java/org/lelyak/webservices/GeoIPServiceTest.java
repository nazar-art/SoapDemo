package org.lelyak.webservices;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GeoIPServiceTest {

    private static Logger log = Logger.getLogger(GeoIPServiceTest.class);
    private GeoIPServiceSoap serviceSoap;
    private GeoIPService geoIPService;
    private GeoIP geoIP;

    public static final String UNITED_STATES = "United States";
    public static final String UNITED_KINGDOM = "United Kingdom";

    @BeforeMethod(groups = "SOAP_GROUP")
    public void setUp() throws Exception {
        geoIPService = new GeoIPService();
    }

    @Test(groups = "SOAP_GROUP", description = "check country name for USA and UK")
    @Parameters( {"googleIpAddress", "bbcIpAddress" })
    public void testGetGeoIPServiceSoap(String googleIpAddress, String bbcIpAddress) throws Exception {
        log.info("test testGetGeoIPServiceSoap() started");
        serviceSoap = geoIPService.getGeoIPServiceSoap();
        geoIP = serviceSoap.getGeoIP(googleIpAddress);
        Assert.assertTrue(geoIP.getCountryName().equalsIgnoreCase(UNITED_STATES), "country code isn't correct for " + UNITED_STATES);

        geoIP = serviceSoap.getGeoIP(bbcIpAddress);
        Assert.assertTrue(geoIP.getCountryName().equalsIgnoreCase(UNITED_KINGDOM), "country code isn't correct for " + UNITED_KINGDOM);
        log.info("test testGetGeoIPServiceSoap() runned successful");
    }

//    @Test(groups = "REST_GROUP")
    public void testGetGeoIPServiceHttpPost() throws Exception {
        GeoIPServiceHttpPost servicePost = geoIPService.getGeoIPServiceHttpPost();

    }
}