### [Решение](https://github.com/Cliffart44/Auto_hw_2.3.1.git) => [домашних](https://github.com/netology-code/aqa-homeworks/tree/aqa4/patterns#%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B0-1---%D0%B7%D0%B0%D0%BA%D0%B0%D0%B7-%D0%B4%D0%BE%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B8-%D0%BA%D0%B0%D1%80%D1%82%D1%8B-%D0%B8%D0%B7%D0%BC%D0%B5%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B4%D0%B0%D1%82%D1%8B) [заданий](https://github.com/netology-code/aqa-homeworks/tree/aqa4/reporting#%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B0-2---report-portal-%D0%BD%D0%B5%D0%BE%D0%B1%D1%8F%D0%B7%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F)

---
### There are 3 easy steps to get started with `ReportPortal`
1. Configure and deploy `ReportPortal`
    * Download the latest `ReportPortal` `Docker compose` file from [here](https://downgit.github.io/#/home?url=https://github.com/reportportal/reportportal/blob/master/docker-compose.yml);
    * configure the `docker-compose.yml` for your current system as provided in this file;
    * start the application using the following command: `docker-compose -p reportportal up -d`.
2. Open `ReportPortal`
    * Open new browser tab with [`ReportPortal`](http://localhost:8080/ui/);
    * use the username `superadmin` and the password `erebus` for access.
3. Integrate with [`Junit5`](https://github.com/reportportal/agent-java-junit5) test framework
    * Configure `build.gradle`;
    * add the test with logging;
    * configuring `ReportPortal`;
    * link `ReportPortal` with your tests.
#### Observing test run report!

---
[![Build status](https://ci.appveyor.com/api/projects/status/dvdgds06vlpbvor5/branch/main?svg=true)](https://ci.appveyor.com/project/Cliffart44/auto-hw-2-3-1/branch/main)

---
[![Gitter](https://badges.gitter.im/Cliffart44/community.svg)](https://gitter.im/Cliffart44/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)